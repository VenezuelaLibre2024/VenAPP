.class public final synthetic Lzd/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljj/a;


# instance fields
.field public final synthetic a:Lzd/h0;

.field public final synthetic b:Lqd/t$a;


# direct methods
.method public synthetic constructor <init>(Lzd/h0;Lqd/t$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzd/v;->a:Lzd/h0;

    iput-object p2, p0, Lzd/v;->b:Lqd/t$a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lzd/v;->a:Lzd/h0;

    iget-object v1, p0, Lzd/v;->b:Lqd/t$a;

    invoke-static {v0, v1}, Lzd/h0;->m(Lzd/h0;Lqd/t$a;)V

    return-void
.end method
