.class final Lg7/b$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg7/b$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg7/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "f"
.end annotation


# instance fields
.field private final a:Lt8/e0;

.field private final b:I

.field private final c:I

.field private d:I

.field private e:I


# direct methods
.method public constructor <init>(Lg7/a$b;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object p1, p1, Lg7/a$b;->b:Lt8/e0;

    iput-object p1, p0, Lg7/b$f;->a:Lt8/e0;

    const/16 v0, 0xc

    invoke-virtual {p1, v0}, Lt8/e0;->U(I)V

    invoke-virtual {p1}, Lt8/e0;->L()I

    move-result v0

    and-int/lit16 v0, v0, 0xff

    iput v0, p0, Lg7/b$f;->c:I

    invoke-virtual {p1}, Lt8/e0;->L()I

    move-result p1

    iput p1, p0, Lg7/b$f;->b:I

    return-void
.end method


# virtual methods
.method public a()I
    .locals 2

    iget v0, p0, Lg7/b$f;->c:I

    const/16 v1, 0x8

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lg7/b$f;->a:Lt8/e0;

    invoke-virtual {v0}, Lt8/e0;->H()I

    move-result v0

    return v0

    :cond_0
    const/16 v1, 0x10

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lg7/b$f;->a:Lt8/e0;

    invoke-virtual {v0}, Lt8/e0;->N()I

    move-result v0

    return v0

    :cond_1
    iget v0, p0, Lg7/b$f;->d:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lg7/b$f;->d:I

    rem-int/lit8 v0, v0, 0x2

    if-nez v0, :cond_2

    iget-object v0, p0, Lg7/b$f;->a:Lt8/e0;

    invoke-virtual {v0}, Lt8/e0;->H()I

    move-result v0

    iput v0, p0, Lg7/b$f;->e:I

    and-int/lit16 v0, v0, 0xf0

    shr-int/lit8 v0, v0, 0x4

    return v0

    :cond_2
    iget v0, p0, Lg7/b$f;->e:I

    and-int/lit8 v0, v0, 0xf

    return v0
.end method

.method public b()I
    .locals 1

    const/4 v0, -0x1

    return v0
.end method

.method public c()I
    .locals 1

    iget v0, p0, Lg7/b$f;->b:I

    return v0
.end method
