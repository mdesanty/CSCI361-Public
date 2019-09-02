public interface IDataStruct
{
    public boolean hasNext();
    public int grabNext();
    public void release();
    public IDataStruct copyMe();
}