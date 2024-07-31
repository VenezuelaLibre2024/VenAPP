.class final Lxk/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwk/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lwk/d<",
        "Luk/f;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Ljava/lang/CharSequence;

.field private final b:I

.field private final c:I

.field private final d:Lok/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lok/p<",
            "Ljava/lang/CharSequence;",
            "Ljava/lang/Integer;",
            "Lck/m<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/CharSequence;IILok/p;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/CharSequence;",
            "II",
            "Lok/p<",
            "-",
            "Ljava/lang/CharSequence;",
            "-",
            "Ljava/lang/Integer;",
            "Lck/m<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;>;)V"
        }
    .end annotation

    const-string v0, "input"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "getNextMatch"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxk/e;->a:Ljava/lang/CharSequence;

    iput p2, p0, Lxk/e;->b:I

    iput p3, p0, Lxk/e;->c:I

    iput-object p4, p0, Lxk/e;->d:Lok/p;

    return-void
.end method

.method public static final synthetic b(Lxk/e;)Lok/p;
    .locals 0

    iget-object p0, p0, Lxk/e;->d:Lok/p;

    return-object p0
.end method

.method public static final synthetic c(Lxk/e;)Ljava/lang/CharSequence;
    .locals 0

    iget-object p0, p0, Lxk/e;->a:Ljava/lang/CharSequence;

    return-object p0
.end method

.method public static final synthetic d(Lxk/e;)I
    .locals 0

    iget p0, p0, Lxk/e;->c:I

    return p0
.end method

.method public static final synthetic e(Lxk/e;)I
    .locals 0

    iget p0, p0, Lxk/e;->b:I

    return p0
.end method


# virtual methods
.method public iterator()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Luk/f;",
            ">;"
        }
    .end annotation

    new-instance v0, Lxk/e$a;

    invoke-direct {v0, p0}, Lxk/e$a;-><init>(Lxk/e;)V

    return-object v0
.end method
