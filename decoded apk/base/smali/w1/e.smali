.class public final synthetic Lw1/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/database/DatabaseErrorHandler;


# instance fields
.field public final synthetic a:Lv1/j$a;

.field public final synthetic b:Lw1/d$b;


# direct methods
.method public synthetic constructor <init>(Lv1/j$a;Lw1/d$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw1/e;->a:Lv1/j$a;

    iput-object p2, p0, Lw1/e;->b:Lw1/d$b;

    return-void
.end method


# virtual methods
.method public final onCorruption(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 2

    iget-object v0, p0, Lw1/e;->a:Lv1/j$a;

    iget-object v1, p0, Lw1/e;->b:Lw1/d$b;

    invoke-static {v0, v1, p1}, Lw1/d$c;->a(Lv1/j$a;Lw1/d$b;Landroid/database/sqlite/SQLiteDatabase;)V

    return-void
.end method
