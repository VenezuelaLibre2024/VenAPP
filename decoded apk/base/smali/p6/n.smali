.class public final synthetic Lp6/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp6/m0$b;


# instance fields
.field public final synthetic a:J

.field public final synthetic b:Lh6/p;


# direct methods
.method public synthetic constructor <init>(JLh6/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lp6/n;->a:J

    iput-object p3, p0, Lp6/n;->b:Lh6/p;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-wide v0, p0, Lp6/n;->a:J

    iget-object v2, p0, Lp6/n;->b:Lh6/p;

    check-cast p1, Landroid/database/sqlite/SQLiteDatabase;

    invoke-static {v0, v1, v2, p1}, Lp6/m0;->o(JLh6/p;Landroid/database/sqlite/SQLiteDatabase;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
