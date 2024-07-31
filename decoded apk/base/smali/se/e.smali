.class public final synthetic Lse/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/google/firebase/perf/metrics/AppStartTrace;

.field public final synthetic b:Lxe/m$b;


# direct methods
.method public synthetic constructor <init>(Lcom/google/firebase/perf/metrics/AppStartTrace;Lxe/m$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lse/e;->a:Lcom/google/firebase/perf/metrics/AppStartTrace;

    iput-object p2, p0, Lse/e;->b:Lxe/m$b;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lse/e;->a:Lcom/google/firebase/perf/metrics/AppStartTrace;

    iget-object v1, p0, Lse/e;->b:Lxe/m$b;

    invoke-static {v0, v1}, Lcom/google/firebase/perf/metrics/AppStartTrace;->d(Lcom/google/firebase/perf/metrics/AppStartTrace;Lxe/m$b;)V

    return-void
.end method
