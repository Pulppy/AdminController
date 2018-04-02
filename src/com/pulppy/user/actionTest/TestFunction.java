package com.pulppy.user.actionTest;

import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

import com.pulppy.user.bean.MusicDTO;
import com.pulppy.user.bean.ProductDTO;
import com.pulppy.user.model.InteractiveAccount;
import com.pulppy.user.model.InteractiveMusic;
import com.pulppy.user.model.InteractiveProduct;

public class TestFunction {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, ParseException {
		InteractiveProduct a = new InteractiveProduct();

		ProductDTO dto = ProductDATA.setProductDTO();
		// a.createProduct(dto);
		a.updateProduct(dto);

	}

}
