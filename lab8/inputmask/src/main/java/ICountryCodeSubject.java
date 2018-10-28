public interface ICountryCodeSubject {
    void registerObserver(ICountryCodeObserver obj);


    void removeObserver(ICountryCodeObserver obj);

    void notifyAlertToObserver(String code, boolean countryCodeSet);

}
