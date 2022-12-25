package exercise1_5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class App {
    private static final String COMMA_DELIMITER = ",";
    private static final CountryArrayManager countryManager = new CountryArrayManager();

    public static void main(String[] args) {
        init();


        /* TODO: write code to test program */
        System.out.println("Original Data:");
        testOriginalData();

        System.out.println("Sort decreasing by population:");
        testSortDecreasingByPopulation();
        System.out.println("Sort increasing by population:");
        testSortIncreasingByPopulation();
        System.out.println("Sort decreasing by area:");
        testSortDecreasingByArea();
        System.out.println("Sort increasing by area:");
        testSortIncreasingByArea();
        System.out.println("Sort decreasing by gdp:");
        testSortDecreasingByGdp();
        System.out.println("Sort increasing by gdp:");
        testSortIncreasingByGdp();

        System.out.println("Africa countries: ");
        testFilterAfricaCountry();
        System.out.println("Asia countries: ");
        testFilterAsiaCountry();
        System.out.println("Europe countries: ");
        testFilterEuropeCountry();
        System.out.println("North America countries: ");
        testFilterNorthAmericaCountry();
        System.out.println("Oceania countries: ");
        testFilterOceaniaCountry();

        //test with howMany = 3
        System.out.println("Most populous countries: ");
        testFilterMostPopulousCountries();
        System.out.println("Least populous countries: ");
        testFilterLeastPopulousCountries();
        System.out.println("Largest ares countries: ");
        testFilterLargestAreaCountries();
        System.out.println("Smallest area countries: ");
        testFilterSmallestAreaCountries();
        System.out.println("Highest gdp countries: ");
        testFilterHighestGdpCountries();
        System.out.println("Lowest gdp countries: ");
        testFilterLowestGdpCountries();
    }

    public static void readListData(String filePath) {
        BufferedReader dataReader = null;
        try {
            dataReader = new BufferedReader(new FileReader(filePath));

            // Read file in java line by line.
            String line;
            while ((line = dataReader.readLine()) != null) {
                List<String> dataList = parseDataLineToList(line);

                if (dataList.get(0).equals("code")) {
                    continue;
                }

                if (dataList.size() != 6) {
                    continue;
                }
                String code = dataList.get(0);
                String name = dataList.get(1);
                int population = Integer.valueOf(dataList.get(2));
                double area = Double.parseDouble(dataList.get(3));
                double gdp = Double.parseDouble(dataList.get(4));
                String continent = dataList.get(5);
                Country newCountry = new Country(code, name);
                if (continent.equals("Asia")) {
                    newCountry = new AsianCountry(code, name, population, area, gdp);
                } else if (continent.equals("Oceania")) {
                    newCountry = new OceaniaCountry(code, name, population, area, gdp);
                } else if (continent.equals("Europe")) {
                    newCountry = new EuropeCountry(code, name, population, area, gdp);
                } else if (continent.equals("North America")) {
                    newCountry = new NorthAmericaCountry(code, name, population, area, gdp);
                } else if (continent.equals("South America")) {
                    newCountry = new SouthAmericanCountry(code, name, population, area, gdp);
                } else {
                    newCountry = new AfricaCountry(code, name, population, area, gdp);
                }
                countryManager.append(newCountry);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (dataReader != null) {
                    dataReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static List<String> parseDataLineToList(String dataLine) {
        List<String> result = new ArrayList<>();
        if (dataLine != null) {
            String[] splitData = dataLine.split(COMMA_DELIMITER);
            for (int i = 0; i < splitData.length; i++) {
                result.add(splitData[i]);
            }
        }

        return result;
    }

    public static String[] parseDataLineToArray(String dataLine) {
        if (dataLine == null) {
            return null;
        }

        return dataLine.split(COMMA_DELIMITER);
    }

    public static void init() {
        String filePath = "src/exercise1_5/countries.csv";
        readListData(filePath);
    }

    public static void testOriginalData() {
        String codesString = CountryArrayManager.codeOfCountriesToString(countryManager.getCountries());
        System.out.println(codesString);
    }

    public static void testSortIncreasingByPopulation() {
        Country[] countries = countryManager.sortByIncreasingPopulation();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codesString);
    }

    public static void testSortDecreasingByPopulation() {
        Country[] countries = countryManager.sortByDecreasingPopulation();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codesString);
    }

    public static void testSortIncreasingByArea() {
        Country[] countries = countryManager.sortByIncreasingArea();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codesString);
    }

    public static void testSortDecreasingByArea() {
        Country[] countries = countryManager.sortByDecreasingArea();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codesString);
    }

    public static void testSortIncreasingByGdp() {
        Country[] countries = countryManager.sortByIncreasingGdp();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codesString);
    }

    public static void testSortDecreasingByGdp() {
        Country[] countries = countryManager.sortByDecreasingGdp();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codesString);
    }

    public static void testFilterAfricaCountry() {
        Country[] countries = countryManager.filterAfricaCountry();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codesString);
    }

    public static void testFilterAsiaCountry() {
        Country[] countries = countryManager.filterAsianCountry();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codesString);
    }

    public static void testFilterEuropeCountry() {
        Country[] countries = countryManager.filterEuropeCountry();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codesString);
    }

    public static void testFilterNorthAmericaCountry() {
        Country[] countries = countryManager.filterNorthAmericaCountry();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codesString);
    }

    public static void testFilterOceaniaCountry() {
        Country[] countries = countryManager.filterOceaniaCountry();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codesString);
    }

    public static void testFilterSouthAmericaCountry() {
        Country[] countries = countryManager.filterSouthAmericanCountries();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codesString);
    }

    public static void testFilterMostPopulousCountries() {
        Country[] countries = countryManager.filterMostPopulousCountries(3);
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codesString);
    }

    public static void testFilterLeastPopulousCountries() {
        Country[] countries = countryManager.filterLeastPopulousCountries(3);
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codesString);
    }

    public static void testFilterLargestAreaCountries() {
        Country[] countries = countryManager.filterLargestAreaCountries(3);
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codesString);
    }

    public static void testFilterSmallestAreaCountries() {
        Country[] countries = countryManager.filterSmallestAreaCountries(3);
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codesString);
    }

    public static void testFilterHighestGdpCountries() {
        Country[] countries = countryManager.filterHighestGdpCountries(3);
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codesString);
    }

    public static void testFilterLowestGdpCountries() {
        Country[] countries = countryManager.filterLowestGdpCountries(3);
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codesString);
    }
}