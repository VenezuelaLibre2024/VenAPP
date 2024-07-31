.class public final La8/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La8/g;


# instance fields
.field private final a:Ls8/j$a;


# direct methods
.method public constructor <init>(Ls8/j$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La8/c;->a:Ls8/j$a;

    return-void
.end method


# virtual methods
.method public a(I)Ls8/j;
    .locals 0

    iget-object p1, p0, La8/c;->a:Ls8/j$a;

    invoke-interface {p1}, Ls8/j$a;->a()Ls8/j;

    move-result-object p1

    return-object p1
.end method
