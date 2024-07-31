.class public final synthetic Lzd/l3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljj/a;


# instance fields
.field public final synthetic a:Lzd/m3;

.field public final synthetic b:Lzd/c3;


# direct methods
.method public synthetic constructor <init>(Lzd/m3;Lzd/c3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzd/l3;->a:Lzd/m3;

    iput-object p2, p0, Lzd/l3;->b:Lzd/c3;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lzd/l3;->a:Lzd/m3;

    iget-object v1, p0, Lzd/l3;->b:Lzd/c3;

    invoke-static {v0, v1}, Lzd/m3;->d(Lzd/m3;Lzd/c3;)V

    return-void
.end method
