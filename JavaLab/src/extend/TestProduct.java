package extend;

public class TestProduct {

	public static void main(String[] args) {

		Product pd = new Product("筆記本", 50);
		System.out.printf("名稱: %s, 價錢: %d%n", pd.getName(), pd.getPrice());

		Notebook nb = new Notebook("Asus", 30000, 365);
		System.out.printf("名稱: %s, 價錢: %d%n", nb.getName(), nb.getPrice());
		System.out.println(nb.name); // 同一個 package 才能有 protected 效果
		System.out.println(nb.disc());

	}

}
