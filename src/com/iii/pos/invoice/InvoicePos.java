package com.iii.pos.invoice;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.widget.ListView;

import com.iii.pos.R;
import com.iii.pos.adapter.AdapterListInvoice;
import com.iii.pos.adapter.Adapter_List_Dishes;
import com.iii.pos.item.Items_Detail;

public class InvoicePos extends Activity{
	private ListView invoiceList;
	private ArrayList<Invoice_Detail> arr ;
	private AdapterListInvoice adapter;
	private Context context = InvoicePos.this;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.invoice_pos);
		invoiceList = (ListView) findViewById(R.id.listView);
		Invoice_Detail item1 = new Invoice_Detail();
		item1.setInv_id(1);
		item1.setName_item("Súp canh gà");
		item1.setUnit_item("Bát");
		item1.setAmount_item(2);
		item1.setCost_item(15);
		item1.setNotes("Giảm giá");
		
		Invoice_Detail item2 = new Invoice_Detail();
		item2.setInv_id(2);
		item2.setName_item("Súp canh Bò");
		item2.setUnit_item("Bát");
		item2.setAmount_item(2);
		item2.setCost_item(15);
		item2.setNotes("Miễn phí");
		
		Invoice_Detail item3 = new Invoice_Detail();
		item3.setInv_id(3);
		item3.setName_item("Súp canh châu");
		item3.setUnit_item("Bát");
		item3.setAmount_item(2);
		item3.setCost_item(15);
		item3.setNotes("Miễn phí");
		Invoice_Detail item4 = new Invoice_Detail();
		item4.setInv_id(0);
		item4.setName_item("TỔNG TIỀN PHẢI THANH TOÁN");
		item4.setUnit_item("Bát");
		item4.setAmount_item(6);
		item4.setCost_item(45);
		item4.setNotes("");
		
		Invoice_Detail item5 = new Invoice_Detail();
		item5.setInv_id(0);
		item5.setName_item("VAS");
		item5.setUnit_item("");
		item5.setAmount_item(0);
		item5.setCost_item(0.45f);
		item5.setNotes("");
		
		Invoice_Detail item6 = new Invoice_Detail();
		item6.setInv_id(0);
		item6.setName_item("TOTAL");
		item6.setUnit_item("");
		item6.setAmount_item(0);
		item6.setCost_item(49.5f);
		item6.setNotes("");
		arr = new ArrayList<Invoice_Detail>();
		arr.add(item1);
		arr.add(item2);
		arr.add(item3);
		arr.add(item4);
		arr.add(item5);
		arr.add(item6);
		
		
		adapter = new AdapterListInvoice(context, R.layout.invoice_custom_listview, arr);
		invoiceList.setAdapter(adapter);

	}

}
