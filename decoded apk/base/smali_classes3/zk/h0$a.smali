.class public final Lzk/h0$a;
.super Lgk/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lzk/h0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lgk/b<",
        "Lgk/d;",
        "Lzk/h0;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 2

    sget-object v0, Lgk/d;->n:Lgk/d$b;

    sget-object v1, Lzk/h0$a$a;->a:Lzk/h0$a$a;

    invoke-direct {p0, v0, v1}, Lgk/b;-><init>(Lgk/f$c;Lok/l;)V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/g;)V
    .locals 0

    invoke-direct {p0}, Lzk/h0$a;-><init>()V

    return-void
.end method
