package exercise1_5;

public class CountryArrayManager {
    private Country[] countries;
    private int length;
    private int increment;

    public CountryArrayManager() {
        this.increment = 10;
        countries = new Country[this.increment];
        this.length = 0;
    }

    public CountryArrayManager(int maxLength) {
        this.increment = 10;
        countries = new Country[maxLength];
        this.length = 0;
    }

    public Country[] getCountries() {
        return countries;
    }

    public int getLength() {
        return length;
    }

    public void correct() {
        int nullFirstIndex = 0;
        for (int i = 0; i < this.countries.length; i++) {
            if (this.countries[i] == null) {
                nullFirstIndex = i;
                break;
            }
        }
        if (nullFirstIndex > 0) {
            this.length = nullFirstIndex;
            for (int i = nullFirstIndex; i < this.countries.length; i++) {
                this.countries[i] = null;
            }
        }
    }

    private void allocateMore() {
        Country[] newArray = new Country[this.countries.length + this.increment];
        System.arraycopy(this.countries, 0, newArray, 0, this.countries.length);
        this.countries = newArray;
    }

    public void append(Country country) {
        if (this.length >= this.countries.length) {
            allocateMore();
        }
        this.countries[this.length] = country;
        this.length++;
    }

    public boolean add(Country country, int index) {
        if ((index < 0) || (index > this.countries.length)) {
            return false;
        }
        if (this.length >= this.countries.length) {
            allocateMore();
        }
        for (int i = this.length; i > index; i--) {
            this.countries[i] = this.countries[i - 1];
        }
        this.countries[index] = country;
        this.length++;
        return true;
    }

    public boolean remove(int index) {
        if ((index < 0) || (index > this.countries.length)) {
            return false;
        }
        for (int i = index; i < length - 1; i++) {
            this.countries[i] = this.countries[i + 1];
        }
        this.countries[this.length - 1] = null;
        this.length--;
        return true;
    }

    public Country countryAt(int index) {
        if ((index < 0) || (index > this.countries.length)) {
            return null;
        }
        return this.countries[index];
    }

    public Country[] sortByIncreasingPopulation() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        for (int i = 0; i < newArray.length - 2; i++) {
            int minIdx = i;
            for (int j = i + 1; j < newArray.length; j++) {
                if (newArray[j].getPopulation() < newArray[minIdx].getPopulation()) {
                    minIdx = j;
                }
            }
            Country temp = newArray[i];
            newArray[i] = newArray[minIdx];
            newArray[minIdx] = temp;
        }

        return newArray;
    }

    public Country[] sortByDecreasingPopulation() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        for (int i = 0; i < newArray.length - 2; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < newArray.length; j++) {
                if (newArray[j].getPopulation() > newArray[maxIdx].getPopulation()) {
                    maxIdx = j;
                }
            }
            Country temp = newArray[i];
            newArray[i] = newArray[maxIdx];
            newArray[maxIdx] = temp;
        }

        return newArray;
    }

    public Country[] sortByIncreasingArea() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        boolean swapped;
        int n = newArray.length;
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (newArray[i - 1].getArea() > newArray[i].getArea()) {
                    Country temp = newArray[i];
                    newArray[i] = newArray[i - 1];
                    newArray[i - 1] = temp;
                    swapped = true;
                }
            }
            n--;
        } while (swapped);
        return newArray;
    }

    public Country[] sortByDecreasingArea() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        boolean swapped;
        int n = newArray.length;
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (newArray[i - 1].getArea() < newArray[i].getArea()) {
                    Country temp = newArray[i];
                    newArray[i] = newArray[i - 1];
                    newArray[i - 1] = temp;
                    swapped = true;
                }
            }
            n--;
        } while (swapped);
        return newArray;
    }

    public Country[] sortByIncreasingGdp() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        for (int i = 1; i < newArray.length; i++) {
            Country key = newArray[i];
            int j = i - 1;
            while (j >= 0 && newArray[j].getArea() > key.getArea()) {
                newArray[j + 1] = newArray[j];
                j--;
            }
            newArray[j + 1] = key;
        }
        return newArray;
    }

    public Country[] sortByDecreasingGdp() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        for (int i = 1; i < newArray.length; i++) {
            Country key = newArray[i];
            int j = i - 1;
            while (j >= 0 && newArray[j].getArea() < key.getArea()) {
                newArray[j + 1] = newArray[j];
                j--;
            }
            newArray[j + 1] = key;
        }
        return newArray;
    }

    public AfricaCountry[] filterAfricaCountry() {
        AfricaCountry[] africaCountries = new AfricaCountry[countries.length];
        int appendIndex = 0;
        for (int i = 0; i < countries.length; i++) {
            if (countries[i] instanceof AfricaCountry) {
                africaCountries[appendIndex] = (AfricaCountry) countries[i];
                appendIndex++;
            }
        }
        return africaCountries;
    }

    public AsianCountry[] filterAsianCountry() {
        AsianCountry[] asianCountries = new AsianCountry[countries.length];
        int appendIndex = 0;
        for (int i = 0; i < countries.length; i++) {
            if (countries[i] instanceof AsianCountry) {
                asianCountries[appendIndex] = (AsianCountry) countries[i];
                appendIndex++;
            }
        }
        return asianCountries;
    }

    public EuropeCountry[] filterEuropeCountry() {
        EuropeCountry[] europeCountries = new EuropeCountry[countries.length];
        int appendIndex = 0;
        for (int i = 0; i < countries.length; i++) {
            if (countries[i] instanceof EuropeCountry) {
                europeCountries[appendIndex] = (EuropeCountry) countries[i];
                appendIndex++;
            }
        }
        return europeCountries;
    }

    public NorthAmericaCountry[] filterNorthAmericaCountry() {
        NorthAmericaCountry[] northAmericaCountries = new NorthAmericaCountry[countries.length];
        int appendIndex = 0;
        for (int i = 0; i < countries.length; i++) {
            if (countries[i] instanceof NorthAmericaCountry) {
                northAmericaCountries[appendIndex] = (NorthAmericaCountry) countries[i];
                appendIndex++;
            }
        }
        return northAmericaCountries;
    }

    public OceaniaCountry[] filterOceaniaCountry() {
        OceaniaCountry[] oceaniaCountries = new OceaniaCountry[countries.length];
        int appendIndex = 0;
        for (int i = 0; i < countries.length; i++) {
            if (countries[i] instanceof OceaniaCountry) {
                oceaniaCountries[appendIndex] = (OceaniaCountry) countries[i];
                appendIndex++;
            }
        }
        return oceaniaCountries;
    }

    public SouthAmericanCountry[] filterSouthAmericanCountries() {
        SouthAmericanCountry[] southAmericanCountries = new SouthAmericanCountry[countries.length];
        int appendIndex = 0;
        for (int i = 0; i < countries.length; i++) {
            if (countries[i] instanceof SouthAmericanCountry) {
                southAmericanCountries[appendIndex] = (SouthAmericanCountry) countries[i];
                appendIndex++;
            }
        }
        return southAmericanCountries;
    }

    public Country[] filterMostPopulousCountries(int howMany) {
        Country[] mostPopulousCountries = new Country[howMany];
        Country[] newArray = sortByDecreasingPopulation();
        for (int i = 0; i < howMany; i++) {
            mostPopulousCountries[i] = newArray[i];
        }
        return mostPopulousCountries;
    }

    public Country[] filterLeastPopulousCountries(int howMany) {
        Country[] leastPopulousCountries = new Country[howMany];
        Country[] newArray = sortByIncreasingPopulation();
        for (int i = 0; i < howMany; i++) {
            leastPopulousCountries[i] = newArray[i];
        }
        return leastPopulousCountries;
    }

    public Country[] filterLargestAreaCountries(int howMany) {
        Country[] largestAreaCountries = new Country[howMany];
        Country[] newArray = sortByDecreasingArea();
        for (int i = 0; i < howMany; i++) {
            largestAreaCountries[i] = newArray[i];
        }
        return largestAreaCountries;
    }

    public Country[] filterSmallestAreaCountries(int howMany) {
        Country[] smallestAreaCountries = new Country[howMany];
        Country[] newArray = sortByIncreasingArea();
        for (int i = 0; i < howMany; i++) {
            smallestAreaCountries[i] = newArray[i];
        }
        return smallestAreaCountries;
    }

    public Country[] filterHighestGdpCountries(int howMany) {
        Country[] highestGpdCountries = new Country[howMany];
        Country[] newArray = sortByDecreasingGdp();
        for (int i = 0; i < howMany; i++) {
            highestGpdCountries[i] = newArray[i];
        }
        return highestGpdCountries;
    }

    public Country[] filterLowestGdpCountries(int howMany) {
        Country[] lowestGdpCountries = new Country[howMany];
        Country[] newArray = sortByIncreasingGdp();
        for (int i = 0; i < howMany; i++) {
            lowestGdpCountries[i] = newArray[i];
        }
        return lowestGdpCountries;
    }

    public static String codeOfCountriesToString(Country[] countries) {
        StringBuilder codeOfCountries = new StringBuilder();
        codeOfCountries.append("[");
        for (int i = 0; i < countries.length; i++) {
            Country country = countries[i];
            if (country != null) {
                codeOfCountries.append(country.getCode())
                        .append(" ");
            }
        }

        return codeOfCountries.toString().trim() + "]";
    }

    public static void print(Country[] countries) {
        StringBuilder countriesString = new StringBuilder();
        countriesString.append("[");
        for (int i = 0; i < countries.length; i++) {
            Country country = countries[i];
            if (country != null) {
                countriesString.append(country.toString()).append("\n");
            }
        }
        System.out.print(countriesString.toString().trim() + "]");
    }
}


