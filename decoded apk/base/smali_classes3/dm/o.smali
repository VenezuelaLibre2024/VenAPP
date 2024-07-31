.class public final Ldm/o;
.super Ldk/c;
.source "SourceFile"

# interfaces
.implements Ljava/util/RandomAccess;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ldm/o$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ldk/c<",
        "Ldm/e;",
        ">;",
        "Ljava/util/RandomAccess;"
    }
.end annotation


# static fields
.field public static final d:Ldm/o$a;


# instance fields
.field private final b:[Ldm/e;

.field private final c:[I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ldm/o$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ldm/o$a;-><init>(Lkotlin/jvm/internal/g;)V

    sput-object v0, Ldm/o;->d:Ldm/o$a;

    return-void
.end method

.method private constructor <init>([Ldm/e;[I)V
    .locals 0

    invoke-direct {p0}, Ldk/c;-><init>()V

    iput-object p1, p0, Ldm/o;->b:[Ldm/e;

    iput-object p2, p0, Ldm/o;->c:[I

    return-void
.end method

.method public synthetic constructor <init>([Ldm/e;[ILkotlin/jvm/internal/g;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ldm/o;-><init>([Ldm/e;[I)V

    return-void
.end method


# virtual methods
.method public c()I
    .locals 1

    iget-object v0, p0, Ldm/o;->b:[Ldm/e;

    array-length v0, v0

    return v0
.end method

.method public final bridge contains(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Ldm/e;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    check-cast p1, Ldm/e;

    invoke-virtual {p0, p1}, Ldm/o;->d(Ldm/e;)Z

    move-result p1

    return p1
.end method

.method public bridge d(Ldm/e;)Z
    .locals 0

    invoke-super {p0, p1}, Ldk/a;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public f(I)Ldm/e;
    .locals 1

    iget-object v0, p0, Ldm/o;->b:[Ldm/e;

    aget-object p1, v0, p1

    return-object p1
.end method

.method public bridge synthetic get(I)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Ldm/o;->f(I)Ldm/e;

    move-result-object p1

    return-object p1
.end method

.method public final bridge indexOf(Ljava/lang/Object;)I
    .locals 1

    instance-of v0, p1, Ldm/e;

    if-nez v0, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    check-cast p1, Ldm/e;

    invoke-virtual {p0, p1}, Ldm/o;->m(Ldm/e;)I

    move-result p1

    return p1
.end method

.method public final k()[Ldm/e;
    .locals 1

    iget-object v0, p0, Ldm/o;->b:[Ldm/e;

    return-object v0
.end method

.method public final l()[I
    .locals 1

    iget-object v0, p0, Ldm/o;->c:[I

    return-object v0
.end method

.method public final bridge lastIndexOf(Ljava/lang/Object;)I
    .locals 1

    instance-of v0, p1, Ldm/e;

    if-nez v0, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    check-cast p1, Ldm/e;

    invoke-virtual {p0, p1}, Ldm/o;->n(Ldm/e;)I

    move-result p1

    return p1
.end method

.method public bridge m(Ldm/e;)I
    .locals 0

    invoke-super {p0, p1}, Ldk/c;->indexOf(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public bridge n(Ldm/e;)I
    .locals 0

    invoke-super {p0, p1}, Ldk/c;->lastIndexOf(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method
