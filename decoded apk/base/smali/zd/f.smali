.class public final synthetic Lzd/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lzd/k;


# direct methods
.method public synthetic constructor <init>(Lzd/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzd/f;->a:Lzd/k;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lzd/f;->a:Lzd/k;

    invoke-static {v0}, Lzd/k;->a(Lzd/k;)Lpf/e;

    move-result-object v0

    return-object v0
.end method
