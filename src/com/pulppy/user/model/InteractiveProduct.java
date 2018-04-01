package com.pulppy.user.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.pulppy.user.bean.ProductDTO;
import com.pulppy.user.connection.MySQLConnUtils;
import com.pulppy.user.template.TemplateFunction;

public class InteractiveProduct {
	
	/*
	 * Function Name : create Product 
	 * Describe : Insert Music 
	 * Return: true
	 */
	public boolean createMusic(ProductDTO product) throws ClassNotFoundException, SQLException {
		boolean result = false;
		result = insertProduct(product);
		return result;
	}
	
	/*
	 * Function Name : insertAccount Describe : Check Duplicate ID and Insert
	 * Return Value: String
	 */
	private boolean insertProduct(ProductDTO product)
			throws ClassNotFoundException, SQLException {
		if (product.getProductName() != null && !product.getProductName().isEmpty() &&
			product.getProductImage() != null && !product.getProductImage().isEmpty() &&
			product.getProductCatelogy() != null && !product.getProductCatelogy().isEmpty() &&
			product.getProductStore() != null && !product.getProductStore().isEmpty() &&
			product.getProductBrand() != null && !product.getProductBrand().isEmpty() &&
			product.getProductShortDecription() != null && !product.getProductShortDecription().isEmpty()) {
			// Query Duplicate ID
			String idGenerate = TemplateFunction.generateRandom();
			if (TemplateFunction.checkDuplicateID(idGenerate, "pProduct") == false) {
				String sql = "Insert into pProduct(id, productName, productImage, productCatelogy, productStore,"
						+ " productPriceDefault, productBrand, productShortDecription, productAmount, productEventStatus, productRate"
						+ ") values(?,?,?,?,?,?,?,?,?,?,?)";
				MySQLConnUtils sqlconn = new MySQLConnUtils();
				Connection conn = sqlconn.getMySQLConnection();
				PreparedStatement pstm = conn.prepareStatement(sql);
				pstm.setString(1, idGenerate);
				pstm.setString(2, product.getProductName());
				pstm.setString(3, product.getProductImage());
				pstm.setString(4, product.getProductCatelogy());
				pstm.setString(5, product.getProductStore());
				pstm.setInt(6, product.getProductPriceDefault());
				pstm.setString(7, product.getProductBrand());
				pstm.setString(8, product.getProductShortDecription());
				pstm.setInt(9, product.getProductAmount());
				pstm.setBoolean(10, product.isProductEventStatus());
				pstm.setInt(11, product.getProductRate());

				pstm.executeUpdate();
				conn.close();
				pstm.close();
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		ProductDTO dto = new ProductDTO();
		dto.setProductName("Testing");
		dto.setProductImage("None");
		dto.setProductCatelogy("None");
		dto.setProductStore("None");
		dto.setProductPriceDefault(100);
		dto.setProductBrand("None");
		dto.setProductShortDecription("none");
		dto.setProductAmount(100);
		dto.setProductEventStatus(true);
		dto.setProductRate(5);
		
		InteractiveProduct a = new InteractiveProduct();
		boolean check = a.insertProduct(dto);
		System.out.println("Result " + check);
	}
}
