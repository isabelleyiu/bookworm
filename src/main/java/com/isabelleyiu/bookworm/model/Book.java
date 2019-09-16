package com.isabelleyiu.bookworm.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

/**
 * @author syiu
 */

@Document(collection="books")
public class Book {
    @Id
    public ObjectId _id;
    public int BibNum;
    public String Title;
    public String Author;
    public String ISBN;
    public String PublicationYear;
    public String Publisher;
    public String Subjects;
    public String ItemType;
    public String ItemCollection;
    public String FloatingItem;
    public String ItemLocation;
    public Date ReportDate;
    public int ItemCount;

    public Book(
            final ObjectId _id,
            final int BibNum,
            final String Title,
            final String Author,
            final String ISBN,
            final String PublicationYear,
            final String Publisher,
            final String Subjects,
            final String ItemType,
            final String ItemCollection,
            final String FloatingItem,
            final String ItemLocation,
            final Date ReportDate,
            final int ItemCount

    ) {
        this._id = _id;
        this.BibNum = BibNum;
        this.Title = Title;
        this.Author = Author;
        this.ISBN = ISBN;
        this.PublicationYear = PublicationYear;
        this.Publisher = Publisher;
        this.Subjects = Subjects;
        this.ItemType = ItemType;
        this.ItemCollection = ItemCollection;
        this.FloatingItem = FloatingItem;
        this.ItemLocation = ItemLocation;
        this.ReportDate = ReportDate;
        this.ItemCount = ItemCount;
    }

    public ObjectId get_id() {
        return _id;
    }

    public void set_id(final ObjectId _id) {
        this._id = _id;
    }

    public int getBibNum() {
        return BibNum;
    }

    public void setBibNum(final int bibNum) {
        BibNum = bibNum;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(final String title) {
        Title = title;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(final String author) {
        Author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(final String ISBN) {
        this.ISBN = ISBN;
    }

    public String getPublicationYear() {
        return PublicationYear;
    }

    public void setPublicationYear(final String publicationYear) {
        PublicationYear = publicationYear;
    }

    public String getPublisher() {
        return Publisher;
    }

    public void setPublisher(final String publisher) {
        Publisher = publisher;
    }

    public String getSubjects() {
        return Subjects;
    }

    public void setSubjects(final String subjects) {
        Subjects = subjects;
    }

    public String getItemType() {
        return ItemType;
    }

    public void setItemType(final String itemType) {
        ItemType = itemType;
    }

    public String getItemCollection() {
        return ItemCollection;
    }

    public void setItemCollection(final String itemCollection) {
        ItemCollection = itemCollection;
    }

    public String getFloatingItem() {
        return FloatingItem;
    }

    public void setFloatingItem(final String floatingItem) {
        FloatingItem = floatingItem;
    }

    public String getItemLocation() {
        return ItemLocation;
    }

    public void setItemLocation(final String itemLocation) {
        ItemLocation = itemLocation;
    }

    public Date getReportDate() {
        return ReportDate;
    }

    public void setReportDate(final Date reportDate) {
        ReportDate = reportDate;
    }

    public int getItemCount() {
        return ItemCount;
    }

    public void setItemCount(final int itemCount) {
        ItemCount = itemCount;
    }
}
