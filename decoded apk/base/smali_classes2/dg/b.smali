.class public abstract Ldg/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ldg/j;


# direct methods
.method protected constructor <init>(Ldg/j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldg/b;->a:Ldg/j;

    return-void
.end method


# virtual methods
.method public abstract a(Ldg/j;)Ldg/b;
.end method

.method public abstract b()Lkg/b;
.end method

.method public abstract c(ILkg/a;)Lkg/a;
.end method

.method public final d()I
    .locals 1

    iget-object v0, p0, Ldg/b;->a:Ldg/j;

    invoke-virtual {v0}, Ldg/j;->a()I

    move-result v0

    return v0
.end method

.method public final e()Ldg/j;
    .locals 1

    iget-object v0, p0, Ldg/b;->a:Ldg/j;

    return-object v0
.end method

.method public final f()I
    .locals 1

    iget-object v0, p0, Ldg/b;->a:Ldg/j;

    invoke-virtual {v0}, Ldg/j;->d()I

    move-result v0

    return v0
.end method
