.class public final synthetic Lp6/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp6/m0$b;


# instance fields
.field public final synthetic a:Lp6/m0;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Ljava/util/Map;

.field public final synthetic d:Lk6/a$a;


# direct methods
.method public synthetic constructor <init>(Lp6/m0;Ljava/lang/String;Ljava/util/Map;Lk6/a$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp6/u;->a:Lp6/m0;

    iput-object p2, p0, Lp6/u;->b:Ljava/lang/String;

    iput-object p3, p0, Lp6/u;->c:Ljava/util/Map;

    iput-object p4, p0, Lp6/u;->d:Lk6/a$a;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lp6/u;->a:Lp6/m0;

    iget-object v1, p0, Lp6/u;->b:Ljava/lang/String;

    iget-object v2, p0, Lp6/u;->c:Ljava/util/Map;

    iget-object v3, p0, Lp6/u;->d:Lk6/a$a;

    check-cast p1, Landroid/database/sqlite/SQLiteDatabase;

    invoke-static {v0, v1, v2, v3, p1}, Lp6/m0;->O(Lp6/m0;Ljava/lang/String;Ljava/util/Map;Lk6/a$a;Landroid/database/sqlite/SQLiteDatabase;)Lk6/a;

    move-result-object p1

    return-object p1
.end method
