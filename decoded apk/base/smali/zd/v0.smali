.class public final synthetic Lzd/v0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljj/a;


# instance fields
.field public final synthetic a:Lzd/w0;

.field public final synthetic b:Lpf/b;


# direct methods
.method public synthetic constructor <init>(Lzd/w0;Lpf/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzd/v0;->a:Lzd/w0;

    iput-object p2, p0, Lzd/v0;->b:Lpf/b;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lzd/v0;->a:Lzd/w0;

    iget-object v1, p0, Lzd/v0;->b:Lpf/b;

    invoke-static {v0, v1}, Lzd/w0;->e(Lzd/w0;Lpf/b;)V

    return-void
.end method
