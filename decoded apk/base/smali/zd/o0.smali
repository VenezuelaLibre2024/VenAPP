.class public final synthetic Lzd/o0;
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

    iput-object p1, p0, Lzd/o0;->a:Lzd/w0;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lzd/o0;->a:Lzd/w0;

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {v0, p1}, Lzd/w0;->b(Lzd/w0;Ljava/lang/Throwable;)V

    return-void
.end method
