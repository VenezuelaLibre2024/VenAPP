.class public final synthetic Lzd/n0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljj/d;


# instance fields
.field public final synthetic a:Lzd/w0;


# direct methods
.method public synthetic constructor <init>(Lzd/w0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzd/n0;->a:Lzd/w0;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lzd/n0;->a:Lzd/w0;

    check-cast p1, Lpf/b;

    invoke-static {v0, p1}, Lzd/w0;->c(Lzd/w0;Lpf/b;)V

    return-void
.end method
