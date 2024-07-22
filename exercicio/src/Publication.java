public interface Publication {
    public abstract void open();
    public abstract void close();
    public abstract void flipPages(int page);
    public abstract void nextPage();
    public abstract void previousPage();
}
