.class public final synthetic Lzd/s1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljj/d;


# instance fields
.field public final synthetic a:Lzd/r3;


# direct methods
.method public synthetic constructor <init>(Lzd/r3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzd/s1;->a:Lzd/r3;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lzd/s1;->a:Lzd/r3;

    check-cast p1, Lpf/e;

    invoke-virtual {v0, p1}, Lzd/r3;->c(Lpf/e;)V

    return-void
.end method
