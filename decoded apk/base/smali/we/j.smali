.class public final synthetic Lwe/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lwe/k;

.field public final synthetic b:Lwe/c;


# direct methods
.method public synthetic constructor <init>(Lwe/k;Lwe/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwe/j;->a:Lwe/k;

    iput-object p2, p0, Lwe/j;->b:Lwe/c;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lwe/j;->a:Lwe/k;

    iget-object v1, p0, Lwe/j;->b:Lwe/c;

    invoke-static {v0, v1}, Lwe/k;->c(Lwe/k;Lwe/c;)V

    return-void
.end method
