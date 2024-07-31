.class public final synthetic Lhc/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/OnFailureListener;


# instance fields
.field public final synthetic a:Lhc/m;


# direct methods
.method public synthetic constructor <init>(Lhc/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhc/l;->a:Lhc/m;

    return-void
.end method


# virtual methods
.method public final onFailure(Ljava/lang/Exception;)V
    .locals 1

    iget-object v0, p0, Lhc/l;->a:Lhc/m;

    invoke-static {v0, p1}, Lhc/m;->b(Lhc/m;Ljava/lang/Exception;)V

    return-void
.end method
