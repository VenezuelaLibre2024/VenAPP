.class public final La1/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La1/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, La1/c;

    invoke-direct {v0}, La1/c;-><init>()V

    sput-object v0, La1/c;->a:La1/c;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ly0/b;Ljava/util/List;Lzk/k0;Lok/a;)Lx0/f;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly0/b<",
            "La1/d;",
            ">;",
            "Ljava/util/List<",
            "+",
            "Lx0/d<",
            "La1/d;",
            ">;>;",
            "Lzk/k0;",
            "Lok/a<",
            "+",
            "Ljava/io/File;",
            ">;)",
            "Lx0/f<",
            "La1/d;",
            ">;"
        }
    .end annotation

    const-string v0, "migrations"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scope"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "produceFile"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lx0/g;->a:Lx0/g;

    sget-object v2, La1/h;->a:La1/h;

    new-instance v6, La1/c$a;

    invoke-direct {v6, p4}, La1/c$a;-><init>(Lok/a;)V

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    invoke-virtual/range {v1 .. v6}, Lx0/g;->a(Lx0/k;Ly0/b;Ljava/util/List;Lzk/k0;Lok/a;)Lx0/f;

    move-result-object p1

    new-instance p2, La1/b;

    invoke-direct {p2, p1}, La1/b;-><init>(Lx0/f;)V

    return-object p2
.end method
