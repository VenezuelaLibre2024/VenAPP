.class public final synthetic Lzd/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljj/a;


# instance fields
.field public final synthetic a:Lzd/h0;

.field public final synthetic b:Lqd/t$b;


# direct methods
.method public synthetic constructor <init>(Lzd/h0;Lqd/t$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzd/z;->a:Lzd/h0;

    iput-object p2, p0, Lzd/z;->b:Lqd/t$b;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lzd/z;->a:Lzd/h0;

    iget-object v1, p0, Lzd/z;->b:Lqd/t$b;

    invoke-static {v0, v1}, Lzd/h0;->j(Lzd/h0;Lqd/t$b;)V

    return-void
.end method
