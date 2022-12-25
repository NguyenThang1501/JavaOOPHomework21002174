package factory.factorymethod.exercise1;

public class WebDialog extends Dialog{


    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
