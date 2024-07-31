.class public Lkg/g;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lkg/b;

.field private final b:[Ldg/s;


# direct methods
.method public constructor <init>(Lkg/b;[Ldg/s;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkg/g;->a:Lkg/b;

    iput-object p2, p0, Lkg/g;->b:[Ldg/s;

    return-void
.end method


# virtual methods
.method public final a()Lkg/b;
    .locals 1

    iget-object v0, p0, Lkg/g;->a:Lkg/b;

    return-object v0
.end method

.method public final b()[Ldg/s;
    .locals 1

    iget-object v0, p0, Lkg/g;->b:[Ldg/s;

    return-object v0
.end method
