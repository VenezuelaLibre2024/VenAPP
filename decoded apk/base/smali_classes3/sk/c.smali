.class public abstract Lsk/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lsk/c$a;
    }
.end annotation


# static fields
.field public static final a:Lsk/c$a;

.field private static final b:Lsk/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lsk/c$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lsk/c$a;-><init>(Lkotlin/jvm/internal/g;)V

    sput-object v0, Lsk/c;->a:Lsk/c$a;

    sget-object v0, Ljk/b;->a:Ljk/a;

    invoke-virtual {v0}, Ljk/a;->b()Lsk/c;

    move-result-object v0

    sput-object v0, Lsk/c;->b:Lsk/c;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final synthetic a()Lsk/c;
    .locals 1

    sget-object v0, Lsk/c;->b:Lsk/c;

    return-object v0
.end method


# virtual methods
.method public abstract b(I)I
.end method

.method public abstract c()I
.end method

.method public abstract d(I)I
.end method

.method public e(II)I
    .locals 4

    invoke-static {p1, p2}, Lsk/d;->b(II)V

    sub-int v0, p2, p1

    const/4 v1, 0x1

    if-gtz v0, :cond_2

    const/high16 v2, -0x80000000

    if-ne v0, v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lsk/c;->c()I

    move-result v0

    const/4 v2, 0x0

    if-gt p1, v0, :cond_1

    if-ge v0, p2, :cond_1

    move v2, v1

    :cond_1
    if-eqz v2, :cond_0

    return v0

    :cond_2
    :goto_0
    neg-int p2, v0

    and-int/2addr p2, v0

    if-ne p2, v0, :cond_3

    invoke-static {v0}, Lsk/d;->c(I)I

    move-result p2

    invoke-virtual {p0, p2}, Lsk/c;->b(I)I

    move-result p2

    goto :goto_1

    :cond_3
    invoke-virtual {p0}, Lsk/c;->c()I

    move-result p2

    ushr-int/2addr p2, v1

    rem-int v2, p2, v0

    sub-int/2addr p2, v2

    add-int/lit8 v3, v0, -0x1

    add-int/2addr p2, v3

    if-ltz p2, :cond_3

    move p2, v2

    :goto_1
    add-int/2addr p1, p2

    return p1
.end method
