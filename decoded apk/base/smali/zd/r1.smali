.class public final synthetic Lzd/r1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljj/d;


# instance fields
.field public final synthetic a:Lzd/c;


# direct methods
.method public synthetic constructor <init>(Lzd/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzd/r1;->a:Lzd/c;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lzd/r1;->a:Lzd/c;

    check-cast p1, Lpf/e;

    invoke-virtual {v0, p1}, Lzd/c;->e(Lpf/e;)V

    return-void
.end method
