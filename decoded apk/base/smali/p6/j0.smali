.class public final synthetic Lp6/j0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp6/m0$b;


# instance fields
.field public final synthetic a:Lp6/m0;

.field public final synthetic b:J


# direct methods
.method public synthetic constructor <init>(Lp6/m0;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp6/j0;->a:Lp6/m0;

    iput-wide p2, p0, Lp6/j0;->b:J

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lp6/j0;->a:Lp6/m0;

    iget-wide v1, p0, Lp6/j0;->b:J

    check-cast p1, Landroid/database/sqlite/SQLiteDatabase;

    invoke-static {v0, v1, v2, p1}, Lp6/m0;->j0(Lp6/m0;JLandroid/database/sqlite/SQLiteDatabase;)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method
