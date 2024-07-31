.class public final Leg/a;
.super Lkg/g;
.source "SourceFile"


# instance fields
.field private final c:Z

.field private final d:I

.field private final e:I


# direct methods
.method public constructor <init>(Lkg/b;[Ldg/s;ZII)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lkg/g;-><init>(Lkg/b;[Ldg/s;)V

    iput-boolean p3, p0, Leg/a;->c:Z

    iput p4, p0, Leg/a;->d:I

    iput p5, p0, Leg/a;->e:I

    return-void
.end method


# virtual methods
.method public c()I
    .locals 1

    iget v0, p0, Leg/a;->d:I

    return v0
.end method

.method public d()I
    .locals 1

    iget v0, p0, Leg/a;->e:I

    return v0
.end method

.method public e()Z
    .locals 1

    iget-boolean v0, p0, Leg/a;->c:Z

    return v0
.end method
