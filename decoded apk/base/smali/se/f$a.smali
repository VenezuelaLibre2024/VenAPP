.class public Lse/f$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lse/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field a:I

.field b:I

.field c:I


# direct methods
.method public constructor <init>(III)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lse/f$a;->a:I

    iput p2, p0, Lse/f$a;->b:I

    iput p3, p0, Lse/f$a;->c:I

    return-void
.end method


# virtual methods
.method public a(Lse/f$a;)Lse/f$a;
    .locals 3

    iget v0, p0, Lse/f$a;->a:I

    invoke-virtual {p1}, Lse/f$a;->d()I

    move-result v1

    sub-int/2addr v0, v1

    iget v1, p0, Lse/f$a;->b:I

    invoke-virtual {p1}, Lse/f$a;->c()I

    move-result v2

    sub-int/2addr v1, v2

    iget v2, p0, Lse/f$a;->c:I

    invoke-virtual {p1}, Lse/f$a;->b()I

    move-result p1

    sub-int/2addr v2, p1

    new-instance p1, Lse/f$a;

    invoke-direct {p1, v0, v1, v2}, Lse/f$a;-><init>(III)V

    return-object p1
.end method

.method public b()I
    .locals 1

    iget v0, p0, Lse/f$a;->c:I

    return v0
.end method

.method public c()I
    .locals 1

    iget v0, p0, Lse/f$a;->b:I

    return v0
.end method

.method public d()I
    .locals 1

    iget v0, p0, Lse/f$a;->a:I

    return v0
.end method
