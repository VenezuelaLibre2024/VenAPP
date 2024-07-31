.class final Llh/a$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Llh/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "d"
.end annotation


# instance fields
.field private final a:I

.field private final b:I

.field private final c:I


# direct methods
.method constructor <init>(III)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Llh/a$d;->a:I

    iput p2, p0, Llh/a$d;->b:I

    iput p3, p0, Llh/a$d;->c:I

    return-void
.end method


# virtual methods
.method a()I
    .locals 1

    iget v0, p0, Llh/a$d;->c:I

    return v0
.end method

.method b()I
    .locals 2

    invoke-virtual {p0}, Llh/a$d;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, Llh/a$d;->c:I

    const/16 v1, 0xb4

    if-eq v0, v1, :cond_0

    iget v0, p0, Llh/a$d;->a:I

    goto :goto_0

    :cond_0
    iget v0, p0, Llh/a$d;->b:I

    :goto_0
    return v0
.end method

.method c()I
    .locals 2

    invoke-virtual {p0}, Llh/a$d;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, Llh/a$d;->c:I

    const/16 v1, 0xb4

    if-eq v0, v1, :cond_0

    iget v0, p0, Llh/a$d;->b:I

    goto :goto_0

    :cond_0
    iget v0, p0, Llh/a$d;->a:I

    :goto_0
    return v0
.end method

.method d()Z
    .locals 2

    iget v0, p0, Llh/a$d;->c:I

    const/16 v1, 0x5a

    if-eq v0, v1, :cond_1

    const/16 v1, 0x10e

    if-eq v0, v1, :cond_1

    const/16 v1, 0xb4

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method
