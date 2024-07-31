.class public final Lwk/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwk/d;
.implements Lwk/c;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lwk/d<",
        "TT;>;",
        "Lwk/c<",
        "TT;>;"
    }
.end annotation


# instance fields
.field private final a:Lwk/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwk/d<",
            "TT;>;"
        }
    .end annotation
.end field

.field private final b:I


# direct methods
.method public constructor <init>(Lwk/d;I)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwk/d<",
            "+TT;>;I)V"
        }
    .end annotation

    const-string v0, "sequence"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwk/b;->a:Lwk/d;

    iput p2, p0, Lwk/b;->b:I

    if-ltz p2, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    return-void

    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "count must be non-negative, but was "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 p2, 0x2e

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public static final synthetic b(Lwk/b;)I
    .locals 0

    iget p0, p0, Lwk/b;->b:I

    return p0
.end method

.method public static final synthetic c(Lwk/b;)Lwk/d;
    .locals 0

    iget-object p0, p0, Lwk/b;->a:Lwk/d;

    return-object p0
.end method


# virtual methods
.method public a(I)Lwk/d;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Lwk/d<",
            "TT;>;"
        }
    .end annotation

    iget v0, p0, Lwk/b;->b:I

    add-int/2addr v0, p1

    if-gez v0, :cond_0

    new-instance v0, Lwk/b;

    invoke-direct {v0, p0, p1}, Lwk/b;-><init>(Lwk/d;I)V

    goto :goto_0

    :cond_0
    new-instance p1, Lwk/b;

    iget-object v1, p0, Lwk/b;->a:Lwk/d;

    invoke-direct {p1, v1, v0}, Lwk/b;-><init>(Lwk/d;I)V

    move-object v0, p1

    :goto_0
    return-object v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lwk/b$a;

    invoke-direct {v0, p0}, Lwk/b$a;-><init>(Lwk/b;)V

    return-object v0
.end method
