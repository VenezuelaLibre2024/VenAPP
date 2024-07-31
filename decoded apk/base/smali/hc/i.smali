.class public final synthetic Lhc/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lhc/j;

.field public final synthetic b:Lec/c;


# direct methods
.method public synthetic constructor <init>(Lhc/j;Lec/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhc/i;->a:Lhc/j;

    iput-object p2, p0, Lhc/i;->b:Lec/c;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lhc/i;->a:Lhc/j;

    iget-object v1, p0, Lhc/i;->b:Lec/c;

    invoke-static {v0, v1}, Lhc/j;->n(Lhc/j;Lec/c;)V

    return-void
.end method
