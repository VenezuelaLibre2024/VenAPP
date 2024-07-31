.class public final Lvl/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lql/v;


# static fields
.field public static final a:Lvl/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lvl/a;

    invoke-direct {v0}, Lvl/a;-><init>()V

    sput-object v0, Lvl/a;->a:Lvl/a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lql/v$a;)Lql/c0;
    .locals 10

    const-string v0, "chain"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lwl/g;

    invoke-virtual {p1}, Lwl/g;->d()Lvl/e;

    move-result-object v0

    invoke-virtual {v0, p1}, Lvl/e;->t(Lwl/g;)Lvl/c;

    move-result-object v3

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/16 v8, 0x3d

    const/4 v9, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v9}, Lwl/g;->c(Lwl/g;ILvl/c;Lql/a0;IIIILjava/lang/Object;)Lwl/g;

    move-result-object v0

    invoke-virtual {p1}, Lwl/g;->h()Lql/a0;

    move-result-object p1

    invoke-virtual {v0, p1}, Lwl/g;->a(Lql/a0;)Lql/c0;

    move-result-object p1

    return-object p1
.end method
