package com.radhecodes.gaspoints.persistence;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.radhecodes.gaspoints.model.PointCard;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings({"unchecked", "deprecation"})
public final class PointCardDao_Impl implements PointCardDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<PointCard> __insertionAdapterOfPointCard;

  private final EntityDeletionOrUpdateAdapter<PointCard> __deletionAdapterOfPointCard;

  private final EntityDeletionOrUpdateAdapter<PointCard> __updateAdapterOfPointCard;

  public PointCardDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfPointCard = new EntityInsertionAdapter<PointCard>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `pointcards` (`id`,`pointscardtype`,`barcodedata`) VALUES (nullif(?, 0),?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, PointCard value) {
        stmt.bindLong(1, value.getId());
        if (value.getPointCardType() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getPointCardType());
        }
        if (value.getBarcodeData() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getBarcodeData());
        }
      }
    };
    this.__deletionAdapterOfPointCard = new EntityDeletionOrUpdateAdapter<PointCard>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `pointcards` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, PointCard value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__updateAdapterOfPointCard = new EntityDeletionOrUpdateAdapter<PointCard>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR REPLACE `pointcards` SET `id` = ?,`pointscardtype` = ?,`barcodedata` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, PointCard value) {
        stmt.bindLong(1, value.getId());
        if (value.getPointCardType() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getPointCardType());
        }
        if (value.getBarcodeData() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getBarcodeData());
        }
        stmt.bindLong(4, value.getId());
      }
    };
  }

  @Override
  public long insertCard(final PointCard pointCard) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      long _result = __insertionAdapterOfPointCard.insertAndReturnId(pointCard);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteCard(final PointCard pointCard) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfPointCard.handle(pointCard);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public int updateCard(final PointCard pointCard) {
    __db.assertNotSuspendingTransaction();
    int _total = 0;
    __db.beginTransaction();
    try {
      _total +=__updateAdapterOfPointCard.handle(pointCard);
      __db.setTransactionSuccessful();
      return _total;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public LiveData<List<PointCard>> getAllCard() {
    final String _sql = "SELECT * FROM pointcards";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"pointcards"}, false, new Callable<List<PointCard>>() {
      @Override
      public List<PointCard> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfPointCardType = CursorUtil.getColumnIndexOrThrow(_cursor, "pointscardtype");
          final int _cursorIndexOfBarcodeData = CursorUtil.getColumnIndexOrThrow(_cursor, "barcodedata");
          final List<PointCard> _result = new ArrayList<PointCard>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final PointCard _item;
            final String _tmpPointCardType;
            _tmpPointCardType = _cursor.getString(_cursorIndexOfPointCardType);
            final String _tmpBarcodeData;
            _tmpBarcodeData = _cursor.getString(_cursorIndexOfBarcodeData);
            _item = new PointCard(_tmpPointCardType,_tmpBarcodeData);
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            _item.setId(_tmpId);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<PointCard> getCardView(final long id) {
    final String _sql = "SELECT * FROM pointcards WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    return __db.getInvalidationTracker().createLiveData(new String[]{"pointcards"}, false, new Callable<PointCard>() {
      @Override
      public PointCard call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfPointCardType = CursorUtil.getColumnIndexOrThrow(_cursor, "pointscardtype");
          final int _cursorIndexOfBarcodeData = CursorUtil.getColumnIndexOrThrow(_cursor, "barcodedata");
          final PointCard _result;
          if(_cursor.moveToFirst()) {
            final String _tmpPointCardType;
            _tmpPointCardType = _cursor.getString(_cursorIndexOfPointCardType);
            final String _tmpBarcodeData;
            _tmpBarcodeData = _cursor.getString(_cursorIndexOfBarcodeData);
            _result = new PointCard(_tmpPointCardType,_tmpBarcodeData);
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            _result.setId(_tmpId);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }
}
