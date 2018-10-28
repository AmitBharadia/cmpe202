public interface IInputSubject {

    void registerObserver(IInputObserver obj);

    void removeObserver(IInputObserver obj);

    void updateInput(String cc, String phoneNumber);
}
