.class public final synthetic Lfe/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lee/b;


# instance fields
.field public final synthetic a:Lzb/g;


# direct methods
.method public synthetic constructor <init>(Lzb/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfe/d;->a:Lzb/g;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lfe/d;->a:Lzb/g;

    invoke-static {v0}, Lcom/google/firebase/installations/c;->b(Lzb/g;)Lhe/b;

    move-result-object v0

    return-object v0
.end method
