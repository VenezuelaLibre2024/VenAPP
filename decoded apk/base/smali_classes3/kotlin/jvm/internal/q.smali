.class public abstract Lkotlin/jvm/internal/q;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lvk/f;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Lkotlin/jvm/internal/u;-><init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method protected computeReflected()Lvk/b;
    .locals 1

    invoke-static {p0}, Lkotlin/jvm/internal/y;->d(Lkotlin/jvm/internal/q;)Lvk/f;

    move-result-object v0

    return-object v0
.end method

.method public invoke()Ljava/lang/Object;
    .locals 1

    invoke-interface {p0}, Lvk/f;->get()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
