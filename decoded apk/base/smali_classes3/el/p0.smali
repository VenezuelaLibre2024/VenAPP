.class final Lel/p0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lgk/f;

.field private final b:[Ljava/lang/Object;

.field private final c:[Lzk/r2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lzk/r2<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private d:I


# direct methods
.method public constructor <init>(Lgk/f;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lel/p0;->a:Lgk/f;

    new-array p1, p2, [Ljava/lang/Object;

    iput-object p1, p0, Lel/p0;->b:[Ljava/lang/Object;

    new-array p1, p2, [Lzk/r2;

    iput-object p1, p0, Lel/p0;->c:[Lzk/r2;

    return-void
.end method


# virtual methods
.method public final a(Lzk/r2;Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzk/r2<",
            "*>;",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, Lel/p0;->b:[Ljava/lang/Object;

    iget v1, p0, Lel/p0;->d:I

    aput-object p2, v0, v1

    iget-object p2, p0, Lel/p0;->c:[Lzk/r2;

    add-int/lit8 v0, v1, 0x1

    iput v0, p0, Lel/p0;->d:I

    const-string v0, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->c(Ljava/lang/Object;Ljava/lang/String;)V

    aput-object p1, p2, v1

    return-void
.end method

.method public final b(Lgk/f;)V
    .locals 4

    iget-object v0, p0, Lel/p0;->c:[Lzk/r2;

    array-length v0, v0

    add-int/lit8 v0, v0, -0x1

    if-ltz v0, :cond_1

    :goto_0
    add-int/lit8 v1, v0, -0x1

    iget-object v2, p0, Lel/p0;->c:[Lzk/r2;

    aget-object v2, v2, v0

    invoke-static {v2}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    iget-object v3, p0, Lel/p0;->b:[Ljava/lang/Object;

    aget-object v0, v3, v0

    invoke-interface {v2, p1, v0}, Lzk/r2;->S(Lgk/f;Ljava/lang/Object;)V

    if-gez v1, :cond_0

    goto :goto_1

    :cond_0
    move v0, v1

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method
