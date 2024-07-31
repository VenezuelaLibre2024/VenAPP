.class public final Lek/d$e;
.super Lek/d$d;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;
.implements Lpk/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lek/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Lek/d$d<",
        "TK;TV;>;",
        "Ljava/util/Iterator<",
        "TK;>;",
        "Lpk/a;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lek/d;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lek/d<",
            "TK;TV;>;)V"
        }
    .end annotation

    const-string v0, "map"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lek/d$d;-><init>(Lek/d;)V

    return-void
.end method


# virtual methods
.method public next()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TK;"
        }
    .end annotation

    invoke-virtual {p0}, Lek/d$d;->a()I

    move-result v0

    invoke-virtual {p0}, Lek/d$d;->d()Lek/d;

    move-result-object v1

    invoke-static {v1}, Lek/d;->d(Lek/d;)I

    move-result v1

    if-ge v0, v1, :cond_0

    invoke-virtual {p0}, Lek/d$d;->a()I

    move-result v0

    add-int/lit8 v1, v0, 0x1

    invoke-virtual {p0, v1}, Lek/d$d;->f(I)V

    invoke-virtual {p0, v0}, Lek/d$d;->g(I)V

    invoke-virtual {p0}, Lek/d$d;->d()Lek/d;

    move-result-object v0

    invoke-static {v0}, Lek/d;->c(Lek/d;)[Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0}, Lek/d$d;->c()I

    move-result v1

    aget-object v0, v0, v1

    invoke-virtual {p0}, Lek/d$d;->e()V

    return-object v0

    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method
