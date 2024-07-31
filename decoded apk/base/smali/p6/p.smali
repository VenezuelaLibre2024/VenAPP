.class public final synthetic Lp6/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp6/m0$b;


# instance fields
.field public final synthetic a:Lp6/m0;

.field public final synthetic b:Lh6/p;


# direct methods
.method public synthetic constructor <init>(Lp6/m0;Lh6/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp6/p;->a:Lp6/m0;

    iput-object p2, p0, Lp6/p;->b:Lh6/p;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lp6/p;->a:Lp6/m0;

    iget-object v1, p0, Lp6/p;->b:Lh6/p;

    check-cast p1, Landroid/database/sqlite/SQLiteDatabase;

    invoke-static {v0, v1, p1}, Lp6/m0;->l(Lp6/m0;Lh6/p;Landroid/database/sqlite/SQLiteDatabase;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
