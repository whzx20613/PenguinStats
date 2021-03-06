package io.penguinstats.bean;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;
import org.json.JSONObject;

public class Stage extends Documentable {

	private int id;
	private String code;
	private List<Integer> normalDrop;
	private List<Integer> specialDrop;
	private List<Integer> extraDrop;
	private int apCost;
	private String category;
	private int chapter;

	public Stage() {}

	public Stage(int id, String code, List<Integer> normalDrop, List<Integer> specialDrop, List<Integer> extraDrop,
			int apCost, String category, int chapter) {
		this.id = id;
		this.code = code;
		this.normalDrop = normalDrop;
		this.specialDrop = specialDrop;
		this.extraDrop = extraDrop;
		this.apCost = apCost;
		this.category = category;
		this.chapter = chapter;
	}

	@SuppressWarnings("unchecked")
	public Stage(Document doc) {
		this.id = doc.getInteger("id");
		this.code = doc.getString("code");
		this.normalDrop = (ArrayList<Integer>)doc.get("normalDrop");
		this.specialDrop = (ArrayList<Integer>)doc.get("specialDrop");
		this.extraDrop = (ArrayList<Integer>)doc.get("extraDrop");
		this.apCost = doc.getInteger("apCost");
		this.category = doc.getString("category");
		this.chapter = doc.getInteger("chapter");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public List<Integer> getNormalDrop() {
		return normalDrop;
	}

	public void setNormalDrop(List<Integer> normalDrop) {
		this.normalDrop = normalDrop;
	}

	public List<Integer> getSpecialDrop() {
		return specialDrop;
	}

	public void setSpecialDrop(List<Integer> specialDrop) {
		this.specialDrop = specialDrop;
	}

	public List<Integer> getExtraDrop() {
		return extraDrop;
	}

	public void setExtraDrop(List<Integer> extraDrop) {
		this.extraDrop = extraDrop;
	}

	public int getApCost() {
		return apCost;
	}

	public void setApCost(int apCost) {
		this.apCost = apCost;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getChapter() {
		return chapter;
	}

	public void setChapter(int chapter) {
		this.chapter = chapter;
	}

	@Override
	public Document toDocument() {
		return new Document().append("id", this.id).append("code", this.code).append("normalDrop", normalDrop)
				.append("specialDrop", specialDrop).append("extraDrop", extraDrop).append("apCost", apCost)
				.append("category", category).append("chapter", chapter);
	}

	public JSONObject asJSON() {
		return new JSONObject().put("id", this.id).put("code", this.code).put("normalDrop", normalDrop)
				.put("specialDrop", specialDrop).put("extraDrop", extraDrop).put("apCost", apCost)
				.put("category", category).put("chapter", chapter);
	}

}
