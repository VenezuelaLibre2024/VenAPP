.class public final Ly5/a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ly5/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/g;)V
    .locals 0

    invoke-direct {p0}, Ly5/a$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Ly5/a;
    .locals 5

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-ge v0, v1, :cond_0

    move v4, v2

    goto :goto_0

    :cond_0
    move v4, v3

    :goto_0
    if-eqz v4, :cond_1

    new-instance v0, Lz5/a;

    invoke-direct {v0}, Lz5/a;-><init>()V

    goto :goto_3

    :cond_1
    if-ne v0, v1, :cond_2

    new-instance v0, Lz5/b;

    invoke-direct {v0}, Lz5/b;-><init>()V

    goto :goto_3

    :cond_2
    const/16 v1, 0x1e

    const/16 v4, 0x21

    if-gt v1, v0, :cond_3

    if-ge v0, v4, :cond_3

    move v1, v2

    goto :goto_1

    :cond_3
    move v1, v3

    :goto_1
    if-eqz v1, :cond_4

    new-instance v0, Lz5/c;

    invoke-direct {v0}, Lz5/c;-><init>()V

    goto :goto_3

    :cond_4
    if-ne v0, v4, :cond_5

    new-instance v0, Lz5/d;

    invoke-direct {v0}, Lz5/d;-><init>()V

    goto :goto_3

    :cond_5
    const/16 v1, 0x22

    if-gt v1, v0, :cond_6

    const v1, 0x7fffffff

    if-ge v0, v1, :cond_6

    goto :goto_2

    :cond_6
    move v2, v3

    :goto_2
    if-eqz v2, :cond_7

    new-instance v0, Lz5/e;

    invoke-direct {v0}, Lz5/e;-><init>()V

    :goto_3
    return-object v0

    :cond_7
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "This sdk version is not supported yet."

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
