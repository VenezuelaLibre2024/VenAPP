.class public final Lql/k;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lvl/g;


# direct methods
.method public constructor <init>()V
    .locals 4

    const-wide/16 v0, 0x5

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    const/4 v3, 0x5

    invoke-direct {p0, v3, v0, v1, v2}, Lql/k;-><init>(IJLjava/util/concurrent/TimeUnit;)V

    return-void
.end method

.method public constructor <init>(IJLjava/util/concurrent/TimeUnit;)V
    .locals 7

    const-string v0, "timeUnit"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lvl/g;

    sget-object v2, Lul/e;->i:Lul/e;

    move-object v1, v0

    move v3, p1

    move-wide v4, p2

    move-object v6, p4

    invoke-direct/range {v1 .. v6}, Lvl/g;-><init>(Lul/e;IJLjava/util/concurrent/TimeUnit;)V

    invoke-direct {p0, v0}, Lql/k;-><init>(Lvl/g;)V

    return-void
.end method

.method public constructor <init>(Lvl/g;)V
    .locals 1

    const-string v0, "delegate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lql/k;->a:Lvl/g;

    return-void
.end method


# virtual methods
.method public final a()Lvl/g;
    .locals 1

    iget-object v0, p0, Lql/k;->a:Lvl/g;

    return-object v0
.end method
