.class final Lzk/a3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgk/f$b;
.implements Lgk/f$c;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lgk/f$b;",
        "Lgk/f$c<",
        "Lzk/a3;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Lzk/a3;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lzk/a3;

    invoke-direct {v0}, Lzk/a3;-><init>()V

    sput-object v0, Lzk/a3;->a:Lzk/a3;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public Q(Lgk/f$c;)Lgk/f;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgk/f$c<",
            "*>;)",
            "Lgk/f;"
        }
    .end annotation

    invoke-static {p0, p1}, Lgk/f$b$a;->c(Lgk/f$b;Lgk/f$c;)Lgk/f;

    move-result-object p1

    return-object p1
.end method

.method public U(Lgk/f;)Lgk/f;
    .locals 0

    invoke-static {p0, p1}, Lgk/f$b$a;->d(Lgk/f$b;Lgk/f;)Lgk/f;

    move-result-object p1

    return-object p1
.end method

.method public b(Lgk/f$c;)Lgk/f$b;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E::",
            "Lgk/f$b;",
            ">(",
            "Lgk/f$c<",
            "TE;>;)TE;"
        }
    .end annotation

    invoke-static {p0, p1}, Lgk/f$b$a;->b(Lgk/f$b;Lgk/f$c;)Lgk/f$b;

    move-result-object p1

    return-object p1
.end method

.method public getKey()Lgk/f$c;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lgk/f$c<",
            "*>;"
        }
    .end annotation

    return-object p0
.end method

.method public z0(Ljava/lang/Object;Lok/p;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(TR;",
            "Lok/p<",
            "-TR;-",
            "Lgk/f$b;",
            "+TR;>;)TR;"
        }
    .end annotation

    invoke-static {p0, p1, p2}, Lgk/f$b$a;->a(Lgk/f$b;Ljava/lang/Object;Lok/p;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
