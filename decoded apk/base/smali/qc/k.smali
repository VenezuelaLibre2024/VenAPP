.class public final synthetic Lqc/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lqc/l;

.field public final synthetic b:Ljava/lang/Runnable;


# direct methods
.method public synthetic constructor <init>(Lqc/l;Ljava/lang/Runnable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqc/k;->a:Lqc/l;

    iput-object p2, p0, Lqc/k;->b:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lqc/k;->a:Lqc/l;

    iget-object v1, p0, Lqc/k;->b:Ljava/lang/Runnable;

    invoke-static {v0, v1}, Lqc/l;->a(Lqc/l;Ljava/lang/Runnable;)V

    return-void
.end method
