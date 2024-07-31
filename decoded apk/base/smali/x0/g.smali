.class public final Lx0/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lx0/g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lx0/g;

    invoke-direct {v0}, Lx0/g;-><init>()V

    sput-object v0, Lx0/g;->a:Lx0/g;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lx0/k;Ly0/b;Ljava/util/List;Lzk/k0;Lok/a;)Lx0/f;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lx0/k<",
            "TT;>;",
            "Ly0/b<",
            "TT;>;",
            "Ljava/util/List<",
            "+",
            "Lx0/d<",
            "TT;>;>;",
            "Lzk/k0;",
            "Lok/a<",
            "+",
            "Ljava/io/File;",
            ">;)",
            "Lx0/f<",
            "TT;>;"
        }
    .end annotation

    const-string p2, "serializer"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "migrations"

    invoke-static {p3, p2}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "scope"

    invoke-static {p4, p2}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "produceFile"

    invoke-static {p5, p2}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v4, Ly0/a;

    invoke-direct {v4}, Ly0/a;-><init>()V

    sget-object p2, Lx0/e;->a:Lx0/e$a;

    invoke-virtual {p2, p3}, Lx0/e$a;->b(Ljava/util/List;)Lok/p;

    move-result-object p2

    invoke-static {p2}, Ldk/p;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    new-instance p2, Lx0/m;

    move-object v0, p2

    move-object v1, p5

    move-object v2, p1

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lx0/m;-><init>(Lok/a;Lx0/k;Ljava/util/List;Lx0/b;Lzk/k0;)V

    return-object p2
.end method
