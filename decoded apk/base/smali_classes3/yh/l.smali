.class public final synthetic Lyh/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lyh/m;

.field public final synthetic b:Lyh/k;


# direct methods
.method public synthetic constructor <init>(Lyh/m;Lyh/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyh/l;->a:Lyh/m;

    iput-object p2, p0, Lyh/l;->b:Lyh/k;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lyh/l;->a:Lyh/m;

    iget-object v1, p0, Lyh/l;->b:Lyh/k;

    invoke-static {v0, v1}, Lyh/m;->a(Lyh/m;Lyh/k;)V

    return-void
.end method
